define(['angular'], function(angular) {

  var DashboardController = ["$scope", "$http", "Uri", function($scope, $http, Uri) {

    $http.get(Uri.appUri("plugin://cockpit-history-plugin/:engine/process-instance"))
      .success(function(data) {
        $scope.processInstanceCounts = data;
      });
  }];

  var Configuration = ['ViewsProvider', function(ViewsProvider) {

	  ViewsProvider.registerDefaultView('cockpit.processDefinition.runtime.tab', {
			id: 'process-history',
			priority: 1,	
			label: 'Process History',
			url: 'plugin://cockpit-history-plugin/static/app/history.html'
	  });
  }];

  var ngModule = angular.module('cockpit.plugin.cockpit-history-plugin', []);

  ngModule.config(Configuration);

  return ngModule;
});
