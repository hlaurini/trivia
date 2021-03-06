'use strict';

/* App Module */

var app = angular.module('marketApp', [
                                             'ngRoute',
                                             'marketControllers',
                                             'marketFilters',
                                             'marketServices'
                                           ]);

app.config(['$routeProvider',
  function($routeProvider) {
    $routeProvider.
      when('/', {
        templateUrl: 'partials/app-list.html',
        controller: 'ListCrtl'
      }).
      when('/view/:appid', {
        templateUrl: 'partials/app-view.html',
        controller: 'ViewCrtl'
      }).
      otherwise({
        redirectTo: '/'
      });
  }]);


