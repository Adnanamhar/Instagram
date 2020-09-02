package com.adnanamhar.instagram.model

class Comment {
    private var comment: String = ""
    private var publisher: String = ""

    constructor()
    constructor(comment: String, publisher: String) {
        this.comment = comment
        this.publisher = publisher

    }

    //  Get
    fun getComment(): String {
        return comment
    }

    fun getPublisher(): String {
        return publisher
    }

    //  Set
    fun setComment(comment: String) {
        this.comment = comment
    }

    fun setPublisher(publisher: String) {
        this.publisher = publisher
    }
}