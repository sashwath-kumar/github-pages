# API Documentation

You can view the API documentation in two ways:

1. [View Documentation on GitHub Pages](https://sashwath-kumar.github.io/github-pages/)
2. Direct link to [Swagger UI](https://sashwath-kumar.github.io/github-pages/swagger-ui)

## API Documentation Preview

<div id="swagger-ui"></div>

<link rel="stylesheet" type="text/css" href="https://cdn.jsdelivr.net/npm/swagger-ui-dist@4.6.0/swagger-ui.css" />

<style>
  body {
    margin: 0;
    padding: 0;
  }
  #swagger-ui {
    max-width: 1460px;
    margin: 0 auto;
  }
</style>

<script src="https://cdn.jsdelivr.net/npm/swagger-ui-dist@4.6.0/swagger-ui-bundle.js"></script>
<script src="https://cdn.jsdelivr.net/npm/swagger-ui-dist@4.6.0/swagger-ui-standalone-preset.js"></script>
<script>
  window.onload = function() {
    const ui = SwaggerUIBundle({
      url: "./swagger.yaml",  // Make sure this path points to your swagger.yaml file
      dom_id: '#swagger-ui',
      deepLinking: true,
      presets: [
        SwaggerUIBundle.presets.apis,
        SwaggerUIStandalonePreset
      ],
      plugins: [
        SwaggerUIBundle.plugins.DownloadUrl
      ],
      layout: "StandaloneLayout"
    });
    window.ui = ui;
  };
</script>