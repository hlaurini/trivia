var indexApp = angular.module('indexApp', []),
    
players  = [{
    'name': 'Player1',
    'lifes': 3
  },
  {
    'name': 'Player2',
    'lifes': 3
  }
]


indexApp.controller('Preguntas', ['$scope', '$http', '$rootScope',
  function ($scope, $http, $rootScope) {
    $http.get('preguntas.json').success(function(data) {

      var preguntas = data.preguntas,
          random = Math.round(Math.random() * (preguntas.length - 1))

      $scope.pregunta = preguntas[random]

      console.log($rootScope.turno)
      if($rootScope.turno == undefined) {
        $rootScope.turno = 0
        console.log($rootScope.turno)
      } else {
        $rootScope.turno = $rootScope.turno + 1 % players.length
        console.log($rootScope.turno)
      }


      
      $scope.player = players[0]
    })
  }]
)
