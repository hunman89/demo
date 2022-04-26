package com.example.target;

import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.Comment;

public interface Test {
    public final class CommentItem {
        protected CommentItem(final Comment node, final String value) {
            this.node = node;
            this.value = value;
        }

        public final Comment node;
        public final String value;
    }

    CommentItem[] leadingComments(final ASTNode node);

    CommentItem[] trailingComments(final ASTNode node);
}
