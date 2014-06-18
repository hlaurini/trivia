var indexApp = angular.module('indexApp', [])

indexApp.controller('Preguntas', ['$scope', '$http',
  function ($scope, $http) {
    $http.get('preguntas.json').success(function(data) {

      var preguntas = data.preguntas,
          random = Math.round(Math.random() * (preguntas.length - 1))

      $scope.pregunta = preguntas[random]
    })
  }]
)
