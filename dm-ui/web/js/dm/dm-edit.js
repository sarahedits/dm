var DM = DM || {};

DM.paper = $(function () {

    var width = 4096, height = 2048;
    var gridStep = 128;

    var paper = Raphael('graph', width, height);

    var background = paper.rect(0, 0, width, height);
    background.attr('stroke', '#ddd');
    background.attr('fill', '#ddd');

    DM.util.gridLines(paper, gridStep, width, height);

    return paper;

});