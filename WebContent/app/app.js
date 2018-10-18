var app = angular.module("myApp", ["ngRoute"]);

app.config(function($routeProvider) {
    $routeProvider
    .when("/", {
        templateUrl : "home.html"
    })
    .when("/users", {
        templateUrl : "views/users.html"
    })
    .when("/signup", {
        templateUrl : "views/signup.html"
    })
    .when("/login", {
        templateUrl : "views/login.html"
    });
});