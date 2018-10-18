var app = angular.module("myApp", ["ngRoute"]);

app.config(function($routeProvider) {
    $routeProvider
    .when("/home", {
        templateUrl : "views/home.html"
    })
    .when("/", {
        templateUrl : "views/home.html"
    })
    .when("/signup", {
        templateUrl : "views/signup.html"
    })
    .when("/login", {
        templateUrl : "views/login.html"
    });
    
});