app.controller('UserController', function($scope, $http) {
	console.log('inside controller');
	$scope.loginFunction = function(){

		console.log('inside function');
		$http.get("api/userinfo/add").then(function(response){
			// success callback
			
			alert("success");
			
		}, function(response){
			// error callback
			
			alert("error");
		});
	}
});

app.controller('BlogController', function($scope) {
	$scope.message = 'Hello from BlogController';
});

app.controller('AboutController', function($scope) {
	$scope.message = 'Hello from AboutController';
});