# Spotify Launcher Android App

> This app fixes a known Spotify bug that prevents you from opening Spotify URIs within the Spotify app. This is useful for example when you would like to use NFC tags to open Spotify playlists. 

By default, Spotify URI links only open the app but do not open the playlist/artist/track in Spotify this is a known bug. 

If you would like to open the `spotify:user:spotify:playlist:37i9dQZF1DWWQRwui0ExPn` URI, you just have to prepend `spotifylauncher://`. The final URI which launches the playlist within Spotify would then look like this: `spotifylauncher://spotify:user:spotify:playlist:37i9dQZF1DWWQRwui0ExPn`.

Putting that URI into NFC tags works flawlessly. If you would like to add compatibility for iOS, I recommend that you add the default Spotify URI as a second entry. 
