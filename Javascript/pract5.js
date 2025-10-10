const data = [
  {
    id: 1,
    name: "Alice",
    department: "Engineering",
    salary: 60000,
    projects: [
      { title: "AI System", budget: 20000 },
      { title: "Web App", budget: 15000 }
    ]
  },
  {
    id: 2,
    name: "Bob",
    department: "Engineering",
    salary: 70000,
    projects: [
      { title: "Mobile App", budget: 25000 }
    ]
  },
  {
    id: 3,
    name: "Charlie",
    department: "HR",
    salary: 40000,
    projects: []
  },
  {
    id: 4,
    name: "David",
    department: "Finance",
    salary: 50000,
    projects: [
      { title: "Audit", budget: 10000 },
      { title: "Investment Plan", budget: 20000 }
    ]
  }
];
const name=data.map(person=>{
    return person.name;
})
//console.log(name);
const e=data.filter(person=>person.department==="Engineering");
//console.log(e);
const totalSalary=data.reduce((acc,person)=>acc+person.salary,0);
//console.log(totalSalary);
const allproject=data.flatMap(person=>person.projects.map(project=>project.title));
console.log(allproject);
const b=data.filter(person=>person.projects.length>=1).map(person=>person.name);
//console.log(b);
const m=data.reduce((acc,salarya)=>salarya.salary>acc.salary ? salarya:acc);
//console.log(m.name);
const budget=data.reduce((acc,person)=>acc+person.projects.reduce((proj,project)=>proj+project.budget,0),0)
console.log(budget);
const deptwise=data.reduce((acc,emp)=>{
    acc[emp.department]=(acc[emp.department]||0)+emp.salary
    return acc;
},{});
//console.log(deptwise);
const empty=data.filter(person=>person.projects.length==0).map(person=>person.name);
console.log(empty)
const combined = data.reduce((maxEmp, emp) => {
  const totalBudget = emp.projects.reduce((sum, p) => sum + p.budget, 0);
  const maxBudget = maxEmp.projects.reduce((sum, p) => sum + p.budget, 0);

  return totalBudget > maxBudget ? emp : maxEmp;
});

console.log(combined.name);

const totalBudget=data.map(person=>{
    return{
        person:person.name,
        budget:person.projects.reduce((acc,project)=>acc+project.budget,0)
    }
})
console.log(totalBudget);
const qwe=data.reduce((acc,emp)=>acc+emp.salary,0);
const abc= {
    totalSalary:qwe,
    
    avg:qwe/data.length
}
console.log(abc);
const sort=[...data].sort((a,b)=>b.salary-a.salary).map(person=>person.name);
console.log(sort);
