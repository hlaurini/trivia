'use strict';

/* Controllers */

var triviaControllers = angular.module('triviaControllers', []);


/**
 * Message controller
 */
triviaControllers.controller('MessageCtrl', ['$scope', '$rootScope','messageService',
function ($scope, $rootScope, messageService) {
	
	$scope.close = function() {
		messageService.clear();
	};
}]);




var players  = [{
    'name': 'Player1',
    'lifes': 3
  },
  {
    'name': 'Player2',
    'lifes': 3
  }
]


triviaControllers.controller('Preguntas', ['$scope', '$http', 'turnoService',
  function ($scope, $http, turnoService) {
    $http.get('preguntas.json').success(function(data) {

      var preguntas = data.preguntas,
          random = Math.round(Math.random() * (preguntas.length - 1))

      $scope.pregunta = preguntas[random]
      
      $scope.player = players[turnoService.getTurno()]
    })
  }]
)

triviaControllers.controller('Splash', ['$scope', 'turnoService',
  function ($scope, turnoService) {
  }]
)

triviaControllers.controller('Ganaste', ['$scope', 'turnoService',
  function ($scope, turnoService) {
  }]
)

triviaControllers.controller('Perdiste', ['$scope', 'turnoService',
  function ($scope, turnoService) {
  	// Se resta una vida
  	players[turnoService.getTurno()].lifes--
  	// Le cede el turno al otro jugador
  	turnoService.nextTurno(players.length)
  }]
)