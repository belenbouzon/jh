(function() {
    'use strict';

    angular
        .module('colorimaApp')
        .controller('GamaDetailController', GamaDetailController);

    GamaDetailController.$inject = ['$scope', '$rootScope', '$stateParams', 'previousState', 'entity', 'Gama'];

    function GamaDetailController($scope, $rootScope, $stateParams, previousState, entity, Gama) {
        var vm = this;

        vm.gama = entity;
        vm.previousState = previousState.name;

        var unsubscribe = $rootScope.$on('colorimaApp:gamaUpdate', function(event, result) {
            vm.gama = result;
        });
        $scope.$on('$destroy', unsubscribe);
    }
})();
