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
  },
  {
    id: 3,
    name: "Sara",
    orders: [
      { id: 105, product: "Tablet", price: 15000 },
      { id: 106, product: "Headphones", price: 2000 }
    ]
  }
];
const userName=users.map(user =>{
    return{
        name:user.name,
        product:user.orders.map(order => order.product)
    }
});

//console.log(userName)
const eachtotal=users.map(user =>{
    const price=user.orders.reduce((sum,order)=>sum+order.price,0)
        return{
            name:user.name,
            spend:price
        }
    
});
//console.log(eachtotal)

const totalSpend=users.reduce((total,user)=>{
  const usertotal=user.orders.reduce((sum,order)=>sum+order.price,0);
  return total+usertotal;
},0);  
//console.log(totalSpend)
const max=users.map(user=>{
  const a=user.orders.reduce((max,order)=>order.price>max?order.price:max,0);
  return{
    name:user.name,
    total:a
  }
})
console.log(max)
const list=users.map(user=>{
  return{
    name:user.name,
    price:user.orders.map(order=>{
      return order.price})
}
}

)
console.log(list)