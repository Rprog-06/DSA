const users = [
  {
    id: 1,
    name: "Alice",
    orders: [
      { id: 101, product: "Laptop", price: 50000 },
      { id: 102, product: "Mouse", price: 1000 }
    ]
  },
  {
    id: 2,
    name: "Bob",
    orders: [
      { id: 103, product: "Phone", price: 20000 },
      { id: 104, product: "Headphones", price: 2000 },
      { id: 105, product: "Keyboard", price: 1500 }
    ]
  }
];
const totalAmount=users.map(user=>{
    const userqa=user.orders.reduce((tot,order)=>tot+order.price,0)
    return{
        name:user.name,
        total:userqa
    }
})
console.log(totalAmount)
const students = [
  { id: 1, name: "Ravi", marks: [80, 75, 90] },
  { id: 2, name: "Sneha", marks: [88, 92, 79, 95] },
  { id: 3, name: "Karan", marks: [60, 65] }
];

const studentTotal=students.map(student=>{
    const sum=student.marks.reduce((sum,mark)=>sum+mark,0)
        return{
            name:student.name,
            avg:sum/student.marks.length
           
        }
    
})
console.log(studentTotal)