package com.github.dirkraft.dm.model.graph;

import com.dirkraft.github.dm.model.graph.Graph;
import com.tinkerpop.blueprints.Edge;
import com.tinkerpop.blueprints.Features;
import com.tinkerpop.blueprints.GraphQuery;
import com.tinkerpop.blueprints.Vertex;

/**
 * @author Jason Dunkelberger (dirkraft)
 */
public class GraphTinker extends GraphElementObj implements Graph, com.tinkerpop.blueprints.Graph {

    protected com.tinkerpop.blueprints.Graph graph;

    /**
     * @param graphImpl actual backing implementation of this graph
     */
    public GraphTinker(com.tinkerpop.blueprints.Graph graphImpl) {
        this.graph = graphImpl;
    }

    // delegation

    @Override
    public Edge addEdge(Object id, Vertex outVertex, Vertex inVertex, String label) {
        return graph.addEdge(id, outVertex, inVertex, label);
    }

    @Override
    public Vertex addVertex(Object id) {
        return graph.addVertex(id);
    }

    @Override
    public Edge getEdge(Object id) {
        return graph.getEdge(id);
    }

    @Override
    public Iterable<Edge> getEdges() {
        return graph.getEdges();
    }

    @Override
    public Iterable<Edge> getEdges(String key, Object value) {
        return graph.getEdges(key, value);
    }

    @Override
    public Features getFeatures() {
        return graph.getFeatures();
    }

    @Override
    public Vertex getVertex(Object id) {
        return graph.getVertex(id);
    }

    @Override
    public Iterable<Vertex> getVertices() {
        return graph.getVertices();
    }

    @Override
    public Iterable<Vertex> getVertices(String key, Object value) {
        return graph.getVertices(key, value);
    }

    @Override
    public GraphQuery query() {
        return graph.query();
    }

    @Override
    public void removeEdge(Edge edge) {
        graph.removeEdge(edge);
    }

    @Override
    public void removeVertex(Vertex vertex) {
        graph.removeVertex(vertex);
    }

    @Override
    public void shutdown() {
        graph.shutdown();
    }
}
