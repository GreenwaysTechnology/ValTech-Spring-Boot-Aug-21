package com.example.restapp.resources;

public class ResposeTransfer {
    private String text;

    public ResposeTransfer() {
    }

    public ResposeTransfer(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
