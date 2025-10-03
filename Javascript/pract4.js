const company = [
  {
    dept: "Engineering",
    employees: [
      { id: 1, name: "Amit" },
      { id: 2, name: "Neha" }
    ]
  },
  {
    dept: "HR",
    employees: [
      { id: 3, name: "Suresh" }
    ]
  },
  {
    dept: "Sales",
    employees: [
      { id: 4, name: "Priya" },
      { id: 5, name: "Raj" },
      { id: 6, name: "Simran" }
    ]
  }
];
const comp=company.map(compan=>{
    return {
        name:compan.dept,
        count:compan.employees.length
    }
})
console.log(comp);
const categories = [
  {
    category: "Electronics",
    products: [
      { id: 1, name: "TV", price: 40000 },
      { id: 2, name: "Laptop", price: 60000 }
    ]
  },
  {
    category: "Clothing",
    products: [
      { id: 3, name: "Shirt", price: 1500 },
      { id: 4, name: "Jeans", price: 2500 }
    ]
  }
];
const allProducts = categories.reduce((acc, cat) => {
  return acc.concat(cat.products);
}, []);

console.log(allProducts);
const max=categories.map(categ =>{
  const a=categ.products.reduce((b,products)=>products.price>b?products.price:b,0)
    return {
       name:categ.category,
       maxprice:a
    }
  
})
console.log(max);
 