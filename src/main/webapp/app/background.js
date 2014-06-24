chrome.app.runtime.onLaunched.addListener(function() {
  chrome.app.window.create('index.html', {
    'bounds': {
      'width': 800,
      'height': 600
    }
  });
});


chrome.runtime.onInstalled.addListener(function() {
  // Set up database.
});


chrome.runtime.onSuspend.addListener(function() {
  // Close open connections.
});
