# Spotify Launcher Android App

> This app fixes a known Spotify bug that prevents you from opening Spotify URIs within the Spotify app. This is useful for example when you would like to use NFC tags to open Spotify playlists. 

By default, Spotify URI links only open the app but do not open the playlist/artist/track in Spotify. This is a known bug referenced [here](https://community.spotify.com/t5/Android/URI-and-NFC/td-p/4722563) and [here](https://community.spotify.com/t5/Android/Spotify-URI-and-NFC-can-they-work-together/td-p/4994996). 

## How to use

If you would like to open the `spotify:user:spotify:playlist:37i9dQZF1DWWQRwui0ExPn` URI, you just have to prepend `spotifylauncher://`. The final URI which launches the playlist within Spotify would then look like this: `spotifylauncher://spotify:user:spotify:playlist:37i9dQZF1DWWQRwui0ExPn`.

Putting that URI into NFC tags works flawlessly. If you would like to add compatibility for iOS, I recommend that you add the default Spotify URI as a second entry. 

## Installation

To install this, just download the `.apk` file from the latest [release](https://github.com/EricHier/spotify-launcher/releases) and install it on your mobile phone. The application has no user interface and does not appear in available apps on the home screen. To uninstall it, you have to search for `SpotifyLauncher` in the settings. 
