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

function validateInputs() {
    let movie = $("#movie").val()
    let amount = $("#amount").val()
    let firstname = $("#firstname").val()
    let lastname = $("#lastname").val()
    let phone = $("#phone").val()
    let email = $("#email").val()

    //Removing previous error messages, if any
    $("#error").text("");

    //Validation for each input field, displaying inline errors to user
    if (!movie) {
        $("#movie-error").text("Please select a movie");
        return false;
    }
    if ((amount <= 0) || (amount === "")) {
        $("#amount-error").text("Enter a valid amount");
        return false;
    }
    if (firstname === "") {
        $("#firstname-error").text("Please enter a first name")
        return false;
    }
    if (lastname === "") {
        $("#lastname-error").text("Please enter a last name")
        return false;
    }
    //Using regex to validate phone and email format
    let phoneRegex = /^\+?(\d[\d\s-]{7,14}\d)$/
    if (phone === "" || phoneRegex.test(phone)) {
        $("#phone-error").text("Please enter a valid phone number")
        return false;
    }
    let emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    if (email === "" || !emailRegex.test(email)) {
        $("#email-error").text("Please enter a valid e-mail")
        return false;
    }
    return true; //returns true if every validation is ok
}