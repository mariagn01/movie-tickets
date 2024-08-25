$(function (){
    getMovies();
})

//Functions for retrieving available movies and displaying them in a dropdown menu
function getMovies () {
    $.get("/getMovies", function (movielist) {
        displayMovieList(movielist)
    })
}
function displayMovieList(movielist) {
    let movies = "<select class='form-select' name='movie' id='movie'>" +
        "<option selected disabled placeholder='Choose movie'>Choose movie</option>";
    for (const movie of movielist) {
        movies += "<option value='" + movie + "'>" + movie + "</option>";
    }
    movies += "</select>"
    $("#movie-list").html(movies);
}

function purchase() {

}