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
const result = orders
  .filter(order => {
    const total = order.items.reduce(
      (sum, item) => sum + item.price * item.quantity, 
      0
    );
    console.log(order.customer.name, "spent:", total); // 🔎 debug
    return total > 40000;
  })
  .map(order => order.customer.name);

console.log("Final Result:", result);

const items=orders.flatMap(order=>order.items)
console.log(items);

const all=orders.flatMap(order=>order.items.map(item=>item.product))
console.log(all);

const maxOrder = orders.reduce((max, order) => {
  const maxTotal = max.items.reduce((sum, item) => sum + item.price * item.quantity, 0);
  const orderTotal = order.items.reduce((sum, item) => sum + item.price * item.quantity, 0);
  
  return orderTotal > maxTotal ? order : max;
});

console.log(maxOrder.orderId, maxOrder.customer.name);
const item=orders.filter(emp=>emp.items.some(item=>item.quantity>=2)).map(name=>name.customer.name);
console.log(item);

const av=orders.map(emp=>{
   const b=emp.items.reduce((acc,a)=>acc+a.price*a.quantity,0);
   const c=emp.items.reduce((acc,c)=>acc+c.quantity,0);
   const avg=b/c;
   return{
    name:emp.customer.name,
    avg:avg
   };
   
})
console.log(av);
