const salesData = [
  {
    empId: 1,
    name: "Ravi",
    sales: [
      { product: "Laptop", amount: 40000 },
      { product: "Monitor", amount: 2000 }
    ]
  },
  {
    empId: 2,
    name: "Neha",
    sales: [
      { product: "Monitor", amount: 3000 },
      { product: "Keyboard", amount: 3000 }
    ]
  }
]
const a=salesData.map(n=>{
    const b=n.sales.reduce((acc,emp)=>acc+emp.amount,0)
      return{
        name:n.name,
        salary:b
      }
    
})
console.log(a);
const c=salesData.map(n=>({
   name:n.name,
   salary:n.sales.reduce((acc,emp)=>acc+emp.amount,0)
})).filter(n=>n.salary>10000);
console.log(c)
const allProducts = [...new Set(
  salesData.flatMap(emp => emp.sales.map(s => s.product))
)];
console.log(allProducts); // ["Laptop", "Mouse", "Monitor", "Keyboard"]
const deptData = [
  {
    dept: "IT",
    employees: [
      { name: "Ravi", score: 80 },
      { name: "Arjun", score: 90 }
    ]
  },
  {
    dept: "HR",
    employees: [
      { name: "Neha", score: 70 },
      { name: "Simran", score: 85 },
      {name:"abc",score:90}

    ]
  }
];

const d=deptData.map(n=>{
    const e=n.employees.reduce((acc,emp)=>acc+emp.score,0)
    return{
        dept:n.dept,
        avg:e/n.employees.length
    }
}
)
console.log(d)
