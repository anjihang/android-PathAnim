package org.sun.pathAnim.library.factory;

import android.graphics.Path;

import org.sun.pathAnim.library.Parser.PathParser;

/**
 * Created by 王天明 on 2016/1/5 0005.
 */
public interface PathParserFactory {
    PathParser create(Path path);
}
