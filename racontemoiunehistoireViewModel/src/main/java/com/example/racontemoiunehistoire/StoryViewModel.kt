package com.example.racontemoiunehistoire

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class StoryViewModel : ViewModel() {
    var story = MutableLiveData<Story>()
    init {
        story.value = Story("JP", "Maison des tulipes", "masculin")
    }

    fun setStory(story: Story) {
        this.story?.value = story
    }

    fun setPrenom(prenom: String) {
        val storyToChange = this.story.value
        storyToChange?.prenom = prenom
        storyToChange?.let { story.value = it }
    }
}