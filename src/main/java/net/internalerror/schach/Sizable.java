package main.java.net.internalerror.schach;

import main.java.net.internalerror.schach.components.Node;
import main.java.net.internalerror.schach.util.Vector2;

public interface Sizable {
    <T extends Node> T setSize(Vector2 size);
}
