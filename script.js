// localStorage.clear();
var items=[{
    food_nam:"Sandwich",
    price:"99.00",
    active:"yes",
    date:"15/03/2017",
    category:"Main Course",
    delivery:"Yes",
    link:`<a id="sandwich" onclick="editItems(0)" href="edit-menu-item.html">Edit</a>`,
    cartLink:`<a  href="cart.html" onclick="addItemsCart(0)"> Add To cart</a>`
},{
    food_nam:"pizza",
    price:"99.00",
    active:"yes",
    date:"15/03/2017",
    category:"Main Course",
    delivery:"Yes",
    link:`<a id="pizza" onclick="editItems(1)" href="edit-menu-item.html">Edit</a>`,
    cartLink:`<a href="cart.html" onclick="addItemsCart(1)" > Add To cart</a>`
},
{
    food_nam:"Shafwe",
    price:"99.00",
    active:"yes",
    date:"15/03/2017",
    category:"Main Course",
    delivery:"Yes",
    link:`<a onclick="editItems(2)" href="edit-menu-item.html" ">Edit</a>`,
    cartLink:`<a onclick="addItemsCart(2)" href="cart.html"> Add To cart</a>`
},
{
    food_nam:"biryani",
    price:"99.00",
    active:"yes",
    date:"15/03/2017",
    category:"Main Course",
    delivery:"Yes",
    link:`<a onclick="editItems(3)" href="edit-menu-item.html">Edit</a>`,
    cartLink:`<a onclick="addItemsCart(3)" href="cart.html"> Add To cart</a>`
}];
// localStorage.items;
// var l=["first","second","third","fourth"];
// let indexi=0;
function doOnce() {
    if (!document.cookie.split('; ').find(row => row.startsWith('doOnlyOnce'))) {
      document.cookie = "doOnlyOnce=true; expires=Fri, 31 Dec 9999 23:59:59 GMT; Secure";
    }
  }
// document.cookie='1';
const cookieValue = document.cookie
  .split('; ')
  .find(row => row.startsWith('doOnlyOnce='))
  .split('=')[1];
if (cookieValue==true){
    for(var j in items){
        // console.log(j);
        localStorage.setItem(j,JSON.stringify(items[j]));
        // alert(localStorage.getItem(j));
    }
    localStorage.check_array="2";
}

// console.log(JSON.parse(localStorage.getItem(0)));
// var clicked_index=-1;
function addItems(){
    // let form=document.getElementById("form");
    // console.log(items);
    var table=document.getElementById("table");
    table.innerHTML="";
    var rows=`<th>Name</th>
    <th>Price</th>
    <th>Active</th>
    <th>Date of Launch</th>
    <th>Category</th>
    <th>Free Delivery</th>
    <th>Action</th>`;
    for(var i=0;i<4;i++){
        // console.log(i);
        let j=JSON.parse(localStorage.getItem(i));
        // console.log(j);
            rows+=`<tr>
            <td>${j.food_nam}</td>
            <td>Rs.${j.price}</td>
            <td>${j.active}</td>
            <td>${j.date}</td>
            <td>${j.category}</td>
            <td>${j.delivery}</td>
            <td>${j.link}</td>
            </tr>`;
    }
    table.innerHTML=rows;
    }
// function check(index){
//     localStorage.setItem(clicked_index,parseInt(index));
// }
function editItems(index){
    if (index!=undefined){
    localStorage.clicked_index=index;
    }
    
    let form=document.getElementById("form");
    let name=form[0].value;
    let price=form[1].value;
    let active=form[6].value;
    let date=form[4].value;
    let category=form[5].value;
    let delivery=form[3].value;

    let objq={};
    objq.food_nam=name;
    objq.price=price;
    objq.active=active;
    objq.date=date;
    objq.category=category;
    objq.delivery=delivery;
    objq.link=`<a onclick="editItems(${localStorage.clicked_index})" href="edit-menu-item.html">Edit</a>`;
    objq.cartLink=`<a onclick="addItemsCart(${localStorage.clicked_index})" href="cart.html"> Add To cart</a>`;
    localStorage.setItem(localStorage.clicked_index,JSON.stringify(objq));
}

function changeForm(){
    // localStorage.clicked_index=index;
    let form=document.getElementById("form");
    let obj=JSON.parse(localStorage.getItem(localStorage.clicked_index));
    // alert(obj);
    // document.write(form[0]);
    form[0].value=obj.food_nam;
    form[1].value=obj.price;
    form[6].value=obj.active;
    form[4].value=obj.date;
    form[5].value=obj.category;
    form[2].value=obj.delivery;
}
function addItemsCustomer(){
    var table=document.getElementById("table");
    table.innerHTML="";
    var rows=`<th>Name</th>
    <th>Price</th>
    <th>Active</th>
    <th>Date of Launch</th>
    <th>Category</th>
    <th>Free Delivery</th>
    <th>Action</th>`;
    for(var i=0;i<4;i++){
        // console.log(i);
        let j=JSON.parse(localStorage.getItem(i));
        console.log(j);
        // console.log(j);
            rows+=`<tr>
            <td>${j.food_nam}</td>
            <td>Rs.${j.price}</td>
            <td>${j.active}</td>
            <td>${j.date}</td>
            <td>${j.category}</td>
            <td>${j.delivery}</td>
            <td>${j.cartLink}</td>
            </tr>`;
    }
    table.innerHTML=rows;
}
// var cart_items=[];
// localStorage.cartItems=/
let cart_items=[];
if(localStorage.check_array=='2'){
    localStorage.setItem("cartItems",JSON.stringify(cart_items));
    localStorage.check_array=3;
}
function addItemsCart(row){
    // alert(row);
    if(row!=undefined){
        localStorage.customer_clicked_row=row;
    }
    // var table=document.getElementById("cart-table");
    // table.innerHTML="";
    // alert(table);
    cart_items=JSON.parse(localStorage.cartItems);
    // alert(cart_items);
    
    // let cart_item={food_nam:j.food_nam,delivery:j.delivery,price:j.price+`&nbsp <a onlclick="deleteRow()" href="#">Delete</a></td>`};
    cart_items.push(row);
    cart_items=cart_items.filter(function(el){
        return el!=null;
    });
    localStorage.cartItems=JSON.stringify(cart_items);
    let cart_index=JSON.parse(localStorage.cartItems);
    // console.log(cart_index);
    // for(var k of cart_index){
    //     let j=JSON.parse(localStorage.getItem(k));
    //     var rows=table.insertRow(table.rows.length);
    //     var cell1=rows.insertCell(0);
    //     var cell2=rows.insertCell(1);
    //     var cell3=rows.insertCell(2);
    //     var cell4=rows.insertCell(3);
    //     cell1.innerHTML=j.food_nam;
    //     cell2.innerHTML=j.delivery;
    //     cell3.innerHTML=j.price;
    //     cell4.innerHTML=`<a onlclick="deleteRow(${k})" href="#">Delete</a></td>`;
    // }
}
function addElementsToCart(){
    var table=document.getElementById("cart-table");
    let cart_index=JSON.parse(localStorage.cartItems);
    // console.log(cart_index);
    for(var k of cart_index){
        let j=JSON.parse(localStorage.getItem(k));
        var rows=table.insertRow(table.rows.length);
        var cell1=rows.insertCell(0);
        var cell2=rows.insertCell(1);
        var cell3=rows.insertCell(2);
        var cell4=rows.insertCell(3);
        cell1.innerHTML=j.food_nam;
        cell2.innerHTML=j.delivery;
        cell3.innerHTML=j.price;
        cell4.innerHTML=`<a onclick="deleteRow(${k}); addElementsToCart();" href="cart-notification.html">Delete</a>`;
        // console.log(this);
    }
}
function deleteRow(row_index){

    if (row_index!=undefined){
        localStorage.setItem("deleteIndex",row_index);
    }
    // var table=document.getElementById("cart-table");
    // alert(table.rowIndex);
    cart_items=JSON.parse(localStorage.cartItems);
    // var row_id=event.target.parentNode.parentNode.id;
    // console.log(row_id);
    // for(var i=0;i<cart_items.length;i++){
    //     if(cart_items[i]==row_index){
    //         delete cart_items[i];
    //     }
    // }
    // // alert(localStorage.deleteIndex);
    cart_items=cart_items.filter(function(el){
        return el != localStorage.deleteIndex.toString();
    });
    // // cart_items.remove(row_index);
    // // alert(cart_items);
    localStorage.cartItems=JSON.stringify(cart_items);
    // // alert(localStorage.cartItems);
    // // window.location.href="cart.html";
    // // window.reLoad;
    console.log(row_index);
    var table=document.getElementById("cart-table");
    console.log(table);
}


