const inputs = [2, 5, 6, 3, 0, -12, 34];

function quickSort(array){

    if (array.length == 0){
        return [];
    }

    const smalls = [], bigs= [];
    const first = array [0];

    for (var i = 1 ; i < array.length ; i++){
        const current = array [i];
        if (current < first){
            smalls.push(current);//push modifie le tableau courant
        }
        else{
            bigs.push(current);
        }

    }

return quickSort (smalls).concat(first).concat(quickSort (bigs));  //concat renvoie un new tableau et concatène les tableaux ou valeur, ici récursif
}

console.log(quickSort(inputs));