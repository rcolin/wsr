$(document).ready(function() {

    $( "#test" ).click(function( event ) {

        $.getJSON( "http://localhost:8080/bag/services/id", function( data ) {
            //alert( data.id );
            $("#info").html(data.id);
        });

    });

});