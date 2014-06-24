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


indexApp.controller('Splash', ['$scope',
  function ($scope) {
    // localStorage.setItem('turno', 0);
  }]
)

indexApp.controller('Preguntas', ['$scope', '$http',
  function ($scope, $http) {
    $http.get('preguntas.json').success(function(data) {

      var preguntas = data.preguntas,
          random = Math.round(Math.random() * (preguntas.length - 1))

      $scope.pregunta = preguntas[random]
      
      $scope.player = players[0]
    })
  }]
)

indexApp.controller('Perdiste', ['$scope',
  function ($scope) {
    //turno = turno + 1 % players.length
  }]
)
