const data = [
  {
    id: 1,
    name: "Alice",
    department: "Engineering",
    salary: 60000,
    projects: [
      { name: "Website", hours: 120 },
      { name: "Mobile App", hours: 80 }
    ]
  },
  {
    id: 2,
    name: "Bob",
    department: "Engineering",
    salary: 75000,
    projects: [
      { name: "Website", hours: 200 },
      { name: "Backend", hours: 150 }
    ]
  },
  {
    id: 3,
    name: "Charlie",
    department: "HR",
    salary: 50000,
    projects: [
      { name: "Recruitment", hours: 90 },
      { name: "Training", hours: 75 }
    ]
  }
];
const a=data.map(emp=>emp.name)
console.log(a);
const b=data.filter(sal=>sal.salary>=60000)
console.log(b);
const c=data.reduce((acc,sal)=>acc+sal.salary,0)
console.log(c);
const d=data.filter(emp=>emp.projects.some(proj=>proj.hours>100)).map(emp=>emp.name);
console.log(d);
const e=data.map(emp=>{
  const f=emp.projects.reduce((a,b)=>a+b.hours,0)
    return {
     name:emp.name,
     total:f
    }
  
});
console.log(e)
const f=data.filter(emp=>emp.department==="Engineering").reduce((acc,sal)=>acc+sal.salary,0)
console.log(f);
const g=data.map(emp=>{
   
})



  

