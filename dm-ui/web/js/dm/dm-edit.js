require.config({
    baseUrl: 'js'
});

require(["jquery"], function($) {
    alert($('body'));
});