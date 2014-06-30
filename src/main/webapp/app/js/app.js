'use strict';

/* App Module */

var app = angular.module('tiendaApp', [
                                             'ngRoute',
                                             'triviaControllers',
                                             'tiendaFilters',
                                             'tiendaServices'
                                           ]);

app.config(['$routeProvider',
  function($routeProvider) {
    $routeProvider.
      when('/', {
        templateUrl: 'partials/app-splash.html',
        controller: 'Splash'
      }).
      when('/game', {
        templateUrl: 'partials/app-game.html',
        controller: 'Preguntas'
      }).
      when('/game/ok', {
        templateUrl: 'partials/app-ok.html',
        controller: 'Ganaste'
      }).
      when('/game/fail', {
        templateUrl: 'partials/app-fail.html',
        controller: 'Perdiste'
      }).
      otherwise({
        redirectTo: '/'
      });
  }]);


