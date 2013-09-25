$(function () {

    var width = 4096, height = 2048;

    var paper = Raphael('graph', width, height);

    var background = paper.rect(0, 0, width, height);
    background.attr('stroke', '#ddd');
    background.attr('fill', '#ddd');

    // TODO move to graph util or some such
    var step = 128;
    for (var i = step; i < width; i += step) {
        paper.path('M{0},{1}L{2},{3}'.format(i, 0, i, height)).attr('stroke', '#bbb');
    }
    for (var i = step; i < height; i += step) {
        paper.path('M{0},{1}L{2},{3}'.format(0, i, width, i)).attr('stroke', '#bbb');
    }

});