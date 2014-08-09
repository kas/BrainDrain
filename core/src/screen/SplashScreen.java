package screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL30;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.kensch.braindrain.BrainDrain;
import com.kensch.braindrain.ResourceManager;

public class SplashScreen extends Screen {
	private OrthographicCamera camera;

	@Override
	public void create() {
		camera = new OrthographicCamera();
		camera.setToOrtho(false, BrainDrain.WIDTH, BrainDrain.HEIGHT);
	}

	@Override
	public void update() {

	}

	@Override
	public void render(SpriteBatch sb) {
		// Combines all the camera matrices into one table (use camera. to see
		// matrices)
		sb.setProjectionMatrix(camera.combined);

		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL30.GL_COLOR_BUFFER_BIT);

		sb.begin();
		ResourceManager.font56.setColor(Color.BLACK);
		ResourceManager.font56.draw(sb, "KENSCH", ((BrainDrain.WIDTH / 2) - (ResourceManager.font56.getBounds("KENSCH").width / 2)), (float) (0.75 * BrainDrain.HEIGHT));
		sb.end();
	}

	@Override
	public void resize(int width, int height) {

	}

	@Override
	public void dispose() {

	}

	@Override
	public void pause() {

	}

	@Override
	public void resume() {

	}
}