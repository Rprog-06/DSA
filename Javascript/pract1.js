const users = [
  {
    id: 1,
    name: "Rizwan",
    orders: [
      { id: 101, product: "Laptop", price: 50000 },
      { id: 102, product: "Mouse", price: 1000 }
    ]
  },
  {
    id: 2,
    name: "Aman",
    orders: [
      { id: 103, product: "Phone", price: 20000 },
      { id: 104, product: "Charger", price: 500 }
    ]
  }
];
const userorder=users.map(user =>{
  return {
    name:user.name,
    price:user.orders.map(order=>order.price)
  }
})
console.log(userorder);

const totalPrices = users.reduce((total,user) => {
  const userTotal = user.orders.reduce((sum, order) => sum + order.price, 0);
    return userTotal+total;
},0);
console.log(totalPrices);
const userTotals = users.map(user =>{
  const each=user.orders.reduce((sum,order)=> sum + order.price,0);
  return {
    name:user.name,
    total:each
  
 
  }
});
console.log(userTotals);