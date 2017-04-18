/**
 * 
 */
app.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/application', {templateUrl: APP_URL+'/application/', controller: 'ApplicationCtrl'});
  $routeProvider.when('/resource', {templateUrl: APP_URL+'/resource/', controller: 'ResourceCtrl'});
  $routeProvider.when('/menuManage', {templateUrl: APP_URL+'/menuManage/', controller: 'MenuManageCtrl'});
  $routeProvider.when('/appGrant', {templateUrl: APP_URL+'/appGrant/', controller: 'AppGrantCtrl'});
  $routeProvider.when('/roleManage', {templateUrl: APP_URL+'/roleManage/', controller: 'RoleManageCtrl'});
  $routeProvider.when('/errorview', {template: '功能开发中', controller: ''});
  $routeProvider.otherwise({redirectTo: '/errorview'});
}]);