package dev.yeff.orbital.util;

import com.raylib.Raylib;
import dev.yeff.orbital.math.Vector2f;
import dev.yeff.orbital.resources.AudioClip;
import dev.yeff.orbital.resources.Music;

import static com.raylib.Raylib.LoadMusicStream;
import static com.raylib.Raylib.LoadSound;

/**
 * Utility functions to use Orbital classes as Raylib classes. Meant to be used internally by the engine, for things like rendering.
 *
 * @author YeffyCodeGit
 */
public class RaylibUtil {
    /**
     * Turns an Orbital {@code Vector2f} into a Raylib {@code Raylib.Vector2}.
     *
     * @param vec The orbital vector.
     * @return The Raylib vector.
     */
    public static Raylib.Vector2 getAsRaylibVec2(Vector2f vec) {
        return new Raylib.Vector2().x(vec.x).y(vec.y);
    }

    /**
     * Turns an Orbital {@code AudioClip} into a Raylib {@code Raylib.Sound}.
     *
     * @param sound The orbital audio clip.
     * @return The Raylib sound.
     */
    public static Raylib.Sound getAsRaylibSound(AudioClip sound) {
        return LoadSound(sound.getPath());
    }

    /**
     * Turns an Orbital {@code Music} into a Raylib {@code Raylib.Music}.
     *
     * @param music The orbital music stream.
     * @return The Raylib music.
     */
    public static Raylib.Music getAsRaylibMusic(Music music) {
        return LoadMusicStream(music.getPath());
    }
}
