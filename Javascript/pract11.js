const orders = [
  {
    orderId: 1,
    items: [
      { name: "Phone", price: 12000 },
      { name: "Cover", price: 500 },
      { name: "Earphones", price: 1500 }
    ]
  },
  {
    orderId: 2,
    items: [
      { name: "Laptop", price: 60000 },
      { name: "Mouse", price: 1000 }
    ]
  }
];
const a=orders.map(n=>{
    const b=n.items.reduce((acc,red)=>acc.price>red.price?acc.price:red.price)
    return{
        id:n.orderId,
        price:b
    }
}
)
console.log(a)
const students = [
  { name: "Riya", subjects: [{ sub: "Math", marks: 70 }, { sub: "Eng", marks: 65 }] },
  { name: "Amit", subjects: [{ sub: "Math", marks: 45 }, { sub: "Eng", marks: 85 }] },
  { name: "Simran", subjects: [{ sub: "Math", marks: 80 }, { sub: "Eng", marks: 90 }] }
];
const b=students.filter(n=>n.subjects.every(a=>a.marks>=50
)

)
console.log(b)

const c=students.map(n=>{
    const d=n.subjects.reduce((acc,emp)=>acc+emp.marks,0)
        return{
            sub:n.name,
            marks:d
        }
    
})
console.log(c)
const subjectTotals = students
  .flatMap(s => s.subjects)
  .reduce((acc, sub) => {
    acc[sub.sub] = (acc[sub.sub] || 0) + sub.marks;
    return acc;
  }, {});

console.log(subjectTotals);
// { Math: 195, Eng: 240 }
const company = [
  {
    name: "TechCorp",
    branches: [
      {
        city: "Mumbai",
        sales: [{ quarter: "Q1", revenue: 50000 }, { quarter: "Q2", revenue: 70000 }]
      },
      {
        city: "Pune",
        sales: [{ quarter: "Q1", revenue: 30000 }, { quarter: "Q2", revenue: 40000 }]
      }
    ]
  }
];

const d = company[0].branches.map(branch => {
  const totalRevenue = branch.sales.reduce((acc, s) => acc + s.revenue, 0);
  return {
    branch: branch.city,
    revenue: totalRevenue
  };
});

console.log(d);

