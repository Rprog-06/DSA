 import java.util.*;

public class BallSlideSimulator {
    
    static class Slide {
        int x1, y1, x2, y2;
        int slope; // 1 for positive slope, -1 for negative slope
        
        Slide(int x1, int y1, int x2, int y2) {
            // Ensure x1 <= x2 for consistency
            if (x1 > x2) {
                this.x1 = x2;
                this.y1 = y2;
                this.x2 = x1;
                this.y2 = y1;
            } else {
                this.x1 = x1;
                this.y1 = y1;
                this.x2 = x2;
                this.y2 = y2;
            }
            
            // Determine slope: (y2-y1)/(x2-x1)
            if (this.y2 > this.y1) {
                slope = 1; // Positive slope /
            } else {
                slope = -1; // Negative slope \
            }
        }
        
        boolean isOnSlide(int x, int y) {
            if (x < x1 || x > x2) return false;
            
            // Check if point lies on the line
            if (slope == 1) {
                return y == y1 + (x - x1);
            } else {
                return y == y1 - (x - x1);
            }
        }
        
        int getYAtX(int x) {
            if (slope == 1) {
                return y1 + (x - x1);
            } else {
                return y1 - (x - x1);
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        List<Slide> slides = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            slides.add(new Slide(x1, y1, x2, y2));
        }
        
        int x = sc.nextInt();
        int y = sc.nextInt();
        int energy = sc.nextInt();
        
        while (x > 0 && energy > 0) {
            // Check if on any slide
            Slide currentSlide = null;
            for (Slide slide : slides) {
                if (slide.isOnSlide(x, y)) {
                    currentSlide = slide;
                    break;
                }
            }
            
            if (currentSlide != null) {
                // Slide along the slope
                int dx, dy;
                if (currentSlide.slope == 1) {
                    // Positive slope: move down-left
                    dx = -1;
                    dy = -1;
                } else {
                    // Negative slope: move down-right
                    dx = 1;
                    dy = -1;
                }
                
                // Calculate how far we can slide
                int distance = 0;
                int newX = x, newY = y;
                
                while (energy > 0) {
                    int nextX = newX + dx;
                    int nextY = newY + dy;
                    
                    // Check if still on the slide
                    if (!currentSlide.isOnSlide(nextX, nextY)) {
                        break;
                    }
                    
                    newX = nextX;
                    newY = nextY;
                    energy--;
                    distance++;
                    
                    if (newX == 0) break;
                }
                
                x = newX;
                y = newY;
            } else {
                // Fall down by gravity
                int nextY = y - 1;
                
                // Check if we land on a slide
                Slide landingSlide = null;
                for (Slide slide : slides) {
                    if (slide.isOnSlide(x, nextY)) {
                        landingSlide = slide;
                        break;
                    }
                }
                
                if (landingSlide != null) {
                    y = nextY;
                } else {
                    // Check if stuck (slides on both sides preventing fall)
                    boolean stuck = false;
                    
                    // Check if there are slides blocking downward movement
                    for (Slide slide : slides) {
                        if (slide.x1 <= x && x <= slide.x2) {
                            int slideY = slide.getYAtX(x);
                            if (slideY < y && slideY >= nextY) {
                                stuck = true;
                                break;
                            }
                        }
                    }
                    
                    if (stuck) {
                        // Unlock: spend x * y energy
                        int unlockCost = x * y;
                        if (energy >= unlockCost) {
                            energy -= unlockCost;
                        } else {
                            break; // Not enough energy to unlock
                        }
                    } else {
                        y = nextY;
                    }
                }
            }
        }
        
        System.out.println(x + " " + y);
        sc.close();
    }
} 
    

