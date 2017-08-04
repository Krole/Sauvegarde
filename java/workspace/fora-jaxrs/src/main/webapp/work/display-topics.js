$.get('http://localhost:8080/jax-rs-1/fora/topics')
  //  .then(topics=>topics.map( u  => u.title))
    //.then(titles=>titles.forEach(title => $("section.topics ul").append("<li>"+title+"</li>")));
    .then(topics=>topics.forEach(function(topic){
        //builder
        const li = $('<li>').attr('topic-id', topic.id).text(topic.title);//<li topic-id="2" creation attribut!!> titre du topic </li>
        $("section.topics ul").append(li)
        li.on('click', ()=>selectTopic (topic));
            }));


function selectTopic(topic){
    $('section.selected ul').empty();
    topic.comments.forEach(function(comment){

        const name = comment.user ? comment.user.name : 'Anonymous';
        const li = $('<li>').text(`${name} says: ${comment.content}`);
        $('section.selected ul').append(li);
    });
   // alert('clicked on '+topic.id);
    customizeForm(topic);
}


function customizeForm(topic){
    const url =  `/jax-rs-1/fora/topics/${topic.id}/comments`;
    $('button').on('click', function(){
        const content = $('input').val();
        const user = {
            id:2,
            name: "Nicolas"
        };
        const comment = {user, content};

        $.ajax({
            type : "POST",
            url : url,
            dataType : 'json',
            data : JSON.stringify(comment),
            contentType: "application/json"
    }).then(function(){
        const name = comment.user ? comment.user.name : 'Anonymous';
        const li = $('<li>').text(`${name} says: ${comment.content}`);
        $('section.selected ul').append(li);
    })
   })
}

function addCommentInTopic(content, user, topic){

}
