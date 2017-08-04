var array = [1, 5,10];
//console.log(array.sort());
//console.log(10 <2);

function sort (array){
    var worker = array.slice();/*creer un new tableau*/

        for (var i = 0; i < worker.length; i++){  //double boucle pour parcourir la liste assez de fois pour tout échanger

           var hasSwapped = false;

                for(var j = 0; j < worker.length -i ; j++){

                    if (worker [j] >  worker [j+1]){                   
                        swap(worker, j);
                        hasSwapped = true;
                         }
                     }
            if (hasSwapped == false){
            console.log('Has not swapped for i='+i)
            break;
            }
        }

    return worker;
}

/*
*return a mutated swap array
*/

function swap (array,i){ /*on veut mettre les indices du tableau array */
    //Guards ; defensive programming! = bonne pratique pour éviter les cas chelou
    if(array.length<2){
        return array;
    }
    if (i>=array.length){
        throw 'Bad array size'; //throw fait planter le programme et fait sortir de la fonction
    }
    buffer = array [i+1];
    array [i+1]=array [i] //met la valeur de l'emplacement i à l'emplacement i+1 (se lit de droite à gauche)
    array[i]= buffer;
    return array;
}
console.log(swap([2,3],0).toString() == [3,2].toString() )/*compare 2 tableaux à des adresses différentes donc le double égal n'est pas adapté, tostring permet de comparer en chaine de carac*/

// test à la main
// swap([2,3], 0) == [3,2]
// swap([2,3,4], 0) == [3,2,4];
// swap([2,3,4], 1) == |2,4,3];
// swap([2],0) ==[2];
// swap ([2,3], 3) != [2,3];
//console.log(sort(array));

console.log(sort(array));