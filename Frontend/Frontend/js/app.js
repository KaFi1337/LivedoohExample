(function() {
	var app = angular.module('LivedoohExample', []);

	app.controller('TabCtrl', function() {
		this.tab = 1;

		this.setTab = function(newValue) {
			this.tab = newValue;
		};

		this.isSet = function(tabName) {
			return this.tab === tabName;
		};
	});

	app.controller('DecodeCtrl', function($http, $scope) {

		this.getResult = function(code) {

			$http({
				url : "",
				method : 'GET',
				data : code,
				header : {
					"Content-Type" : "application/json; charset=utf-8"
				}
			}).success(function(response) {
				$scope.decode = response;
			}).error(function(response) {
				console.log(response);
			});

		}

	});
	
	app.controller('EncodeCtrl', function($http, $scope) {

		this.getResult = function(code) {

			$http({
				url : "",
				method : 'GET',
				data : code,
				header : {
					"Content-Type" : "application/json; charset=utf-8"
				}
			}).success(function(response) {
				$scope.encode = response;
			}).error(function(response) {
				console.log(response);
			});

		}

	});

})();
