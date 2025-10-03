const orders = [
  {
    orderId: 1,
    customer: { id: 101, name: "Ravi", city: "Mumbai" },
    items: [
      { product: "Laptop", price: 60000, quantity: 1 },
      { product: "Mouse", price: 1500, quantity: 2 }
    ]
  },
  {
    orderId: 2,
    customer: { id: 102, name: "Sneha", city: "Pune" },
    items: [
      { product: "Phone", price: 25000, quantity: 1 },
      { product: "Headphones", price: 2000, quantity: 1 }
    ]
  },
  {
    orderId: 3,
    customer: { id: 103, name: "Amit", city: "Mumbai" },
    items: [
      { product: "Laptop", price: 60000, quantity: 2 },
      { product: "Keyboard", price: 3000, quantity: 1 }
    ]
  }
];
const a=orders.map(emp=>emp.customer.name)
console.log(a);
const b=orders.filter(emp=>emp.customer.city==="Mumbai").map(emp=>emp.customer.name)
console.log(b);
const c=orders.reduce((acc,price)=>{
    const d=price.items.reduce((sum,total)=>sum+total.price*total.quantity,0)
    return acc + d;
},0)
console.log(c)