# Clothes Consensus

Wireframe:
<img src='http://i.imgur.com/u1p4n03.jpg' title='Video Walkthrough' width='' alt='Video Walkthrough' />

Planning doc:
https://docs.google.com/document/d/1LOxPFthKg2wUkl2SDUod_5-D1DhNKHpguzYgspH2ct8/edit


### Login (hardness: 1)
* Some sort of email auth
* Facebook auth
* Twitter auth
* Concept of a user

### Main Listing/Voting (hardness: 3)
* Customer Adapter
* Action bar
* Dual Look view
* Single Look view
* Flag for inappropriate

### Camera (hardness: 5)
* Store image into local storage/gallery
* Custom overlay
* Dual photo capability
* Rotate camera
* Turn flash on
* Accessing the gallery
* Confirmation

### Camera Confirmation (after photo is taken) : details of look (hardness: 3.5)
* Networking call to POST the photo
* Ability to set timer
* Load image from local storage or gallery
* Add caption
* Share to email/FB/twitter - nice to have

### History of your past looks (Not yet designed) (hardness: 3.5)
* User details/profile
* Username
* Profile image
* No of looks posted(nice to have)

### Adapter
* Single look view (with asking message & result)
* Dual look view
	
### Push notification (not a screen) (hardness: ???)


##Goals
###Sprint 1 Goals
* [ ] Flow through entire app
* [ ] Login (twitter login, because that exists)
* [ ] Android models
* [ ] Access profile or camera
* [ ] The camera activity(built in camera)
* [ ] All the UI elements
* [ ] Fake data
* [ ] Research how to vote(swiping method)
* [ ] UI element for timer?

###Sprint 2 Goals
* [ ] Backend/network
* [ ] Custom camera overlay

###Sprint 3 Goals
* [ ] Push notifications
* [ ] UI polish

###Sprint 4 Goals
* [ ] UI polish
* [ ] Demo planning



##Models
* User
	* Has many looks
	* Has many votes
* Look
	* Has one User
	* Many Votes
	* Expiration time
	* Question text?

* Vote
	* Has one user
	* Has one look

* Look vs Look
	* Join to looks that are being compared


