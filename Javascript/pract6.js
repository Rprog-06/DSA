const data = [
  {
    id: 1,
    name: "Amit",
    dept: "Engineering",
    salary: 70000,
    projects: [
      { name: "AI System", hours: 120 },
      { name: "Web App", hours: 80 }
    ]
  },
  {
    id: 2,
    name: "Priya",
    dept: "Engineering",
    salary: 60000,
    projects: [
      { name: "Web App", hours: 150 },
      { name: "API Service", hours: 100 }
    ]
  },
  {
    id: 3,
    name: "Ravi",
    dept: "HR",
    salary: 40000,
    projects: [
      { name: "Recruitment", hours: 200 }
    ]
  },
  {
    id: 4,
    name: "Neha",
    dept: "Finance",
    salary: 50000,
    projects: [
      { name: "Audit", hours: 90 },
      { name: "Budget Planning", hours: 60 }
    ]
  }
];
const eng=data.filter(name=>name.dept==="Engineering").map(name=>name.name);
console.log(eng)
const hour=data.map(name=>{
    const a=name.projects.reduce((acc,project)=>acc+project.hours,0)

return{
    name:name.name,
    total:a

}
})
console.log(hour);
const sal=data.reduce((a,b)=>a+b.salary,0);
console.log(sal);
const emp = data
  .map(a => {
    const b = a.projects
      .filter(c => c.hours > 100)
      .reduce((acc, d) => acc + d.hours, 0);

    return { name: a.name, hours: b };
  })
  .filter(e => e.hours > 0);  // remove employees with 0

console.log(emp);
