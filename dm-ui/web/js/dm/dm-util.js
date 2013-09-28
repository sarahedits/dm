var DM = DM || {};

DM.util = {

    gridLines: function(paper, step, width, height) {
        // 0.5 to land the line right in the middle of the pixel
        for (var i = step + 0.5; i < width; i += step) {
            paper.path('M{0},{1}L{2},{3}'.format(i, 0, i, height)).attr('stroke', '#bbb');
        }
        for (var j = step + 0.5; j < height; j += step) {
            paper.path('M{0},{1}L{2},{3}'.format(0, j, width, j)).attr('stroke', '#bbb');
        }
    }

};