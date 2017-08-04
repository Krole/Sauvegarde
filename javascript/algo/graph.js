const root = {
    value : 'html',  //cle = value - value = html
    children : [ 'head',
    {
        value : 'body',
        children : [  // children sont des values
            {value : 'div', children : []}, //children sont des objets ici
            {value : 'p', children : []}
            ]
    }  ]

}
console.log(root.children[1].children[1].children.push(root)) //ds le premier children on prend le body (1) et dans el children suivant on prend le 1 dont la value est p

function displayNode (root){
    console.log('node value', root.value);
    displayChildren(root.children);
}
 function displayChildren(children){
     children.forEach( function (child){//list de chose à faire, fonction dans la fonction foreach
        
        if (typeof child === 'string'){
             console.log('leaf' , child);
          }else{
              displayNode(child);
          }
     }); 
     
 }
 displayNode(root);