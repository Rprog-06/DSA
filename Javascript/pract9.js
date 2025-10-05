const students = [
  {
    id: 1,
    name: "Ravi",
    age: 20,
    city: "Mumbai",
    subjects: [
      { name: "Math", marks: 85 },
      { name: "Physics", marks: 92 },
      { name: "Chemistry", marks: 78 }
    ]
  },
  {
    id: 2,
    name: "Sneha",
    age: 21,
    city: "Pune",
    subjects: [
      { name: "Math", marks: 95 },
      { name: "Physics", marks: 89 },
      { name: "Chemistry", marks: 91 }
    ]
  },
  {
    id: 3,
    name: "Amit",
    age: 19,
    city: "Mumbai",
    subjects: [
      { name: "Math", marks: 65 },
      { name: "Physics", marks: 72 },
      { name: "Chemistry", marks: 80 }
    ]
  }
];
const a=students.map(emp=>emp.name)
console.log(a);
const b=students.filter(emp=>emp.age>20).map(emp=>emp.name)
console.log(b);
const c=students.map(stud=>
    stud.subjects.map(sub=>sub.name)
)
console.log(c);
const d=students.map(stud=>{
    const e=stud.subjects.reduce((acc,sub)=>acc+sub.marks,0)
    return{
        name:stud.name,
        marks:e
    }
}
)
console.log(d);
const f=students.filter(stud=>stud.subjects.some(it=>it.marks>90)).map(a=>a.name);
console.log(f);
const g=students.map(emp=>{
    const h=emp.subjects.reduce((acc,sub)=>acc+sub.marks,0);
    const avg=h/emp.subjects.length;
    return{
        name:emp.name,
        avg:avg
    }
}
)
console.log(g);
const topperInMath = students.reduce((topper, emp) => {
  const math = emp.subjects.find(sub => sub.name === "Math");
  return (!topper || math.marks > topper.marks) 
    ? { name: emp.name, marks: math.marks } 
    : topper;
}, null);

console.log(topperInMath);
const studentsByCity = students.reduce((acc, emp) => {
  const city = emp.city;
  if (!acc[city]) {
    acc[city] = [];
  }
  acc[city].push(emp.name);
  return acc;
}, {});

console.log(studentsByCity);
const i=students.reduce((acc,emp)=>{
    const city=emp.city;
    const total=emp.subjects.reduce((acc,emp)=>acc+emp.marks,0)
    if(!acc[city]){
        acc[city]=0
    }
    acc[city]+=total
    return acc;
    },{})
console.log(i);


