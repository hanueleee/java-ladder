package domain;

import exception.ErrorCode;

public class Height {
    private static final int MIN_HEIGHT = 2;
    private static final int MAX_HEIGHT = 100;

    private final int height;

    private Height(int height) {
        this.height = height;
    }

    public static Height from(int height) {
        validate(height);
        return new Height(height);
    }

    private static void validate(int height) {
        if (height < MIN_HEIGHT || MAX_HEIGHT < height) {
            throw new IllegalArgumentException(ErrorCode.NUMBER_NOT_RANGE.getMessage());
        }
    }

    public int getHeight() {
        return height;
    }
}
