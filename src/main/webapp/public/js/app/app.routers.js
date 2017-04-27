/**
 * 
 */
/*
app.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/application', {templateUrl: APP_URL+'/application/', controller: 'ApplicationCtrl'});
  $routeProvider.when('/business', {templateUrl: APP_URL+'/business/', controller: 'BusinessCtrl'});
  $routeProvider.when('/interface', {templateUrl: APP_URL+'/iFace/', controller: 'InterfaceCtrl'});
  $routeProvider.when('/resource', {templateUrl: APP_URL+'/resource/', controller: 'ResourceCtrl'});
  $routeProvider.when('/menuManage', {templateUrl: APP_URL+'/menuManage/', controller: 'MenuManageCtrl'});
  $routeProvider.when('/appGrant', {templateUrl: APP_URL+'/appGrant/', controller: 'AppGrantCtrl'});
  $routeProvider.when('/roleManage', {templateUrl: APP_URL+'/roleManage/', controller: 'RoleManageCtrl'});
  $routeProvider.when('/errorview', {template: '功能开发中', controller: ''});
  $routeProvider.otherwise({redirectTo: '/errorview'});
}]);
*/
app.config(function($stateProvider, $urlRouterProvider) {
  // 
  // For any unmatched url, redirect to /state1 
  $urlRouterProvider.otherwise("/errorview");
  // 
  // Now set up the states 
  $stateProvider
    .state("application", {      url: "/application",
      templateUrl: APP_URL+'/application/',
      //template: "<div>homePage</div>",
      controller: "ApplicationCtrl"
    })
     .state("business", {
      url: "/business",
      templateUrl: APP_URL+'/business/',
      controller: "BusinessCtrl"
    })
    .state("interface", {
      url: "/interface/:id",
      templateUrl: APP_URL+'/iFace/',
      controller: "InterfaceCtrl"
    })
    .state("params", {
      url: "/params/:id",
      templateUrl: APP_URL+'/params/',
      controller: "ParamsCtrl"
    })
    .state("resource", {
      url: "/resource",
      templateUrl: APP_URL+'/resource/',
      controller: "ResourceCtrl"
    })
    .state("role", {
      url: "/role",
      templateUrl: APP_URL+'/role/',
      controller: "RoleCtrl"
    })
    .state("errorview", {
      url: "/errorview",
      template: "<div>homePage</div>",
    });

});