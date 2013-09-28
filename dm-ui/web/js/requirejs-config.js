if (DM) {
    throw "DM is already defined? requirejs-config.js should be loaded first";
}

/**
 * Global DM object
 * @type {{}}
 */
var DM = {

    /**
     * Applies base configuration that should happen before any DM components begin
     */
    configure: function () {

        if (!this.applied) {

            requirejs.config({
                baseUrl: 'js/lib',
                paths: {
                    dm: '../dm'
                }
            });

            DM.configure.applied = true;
            console.log("DM.configure() applied.")
        }
    }

};