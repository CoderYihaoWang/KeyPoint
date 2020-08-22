# KeyPoint

## Introduction
- [KeyPoint](https://trex-sandwich.com/taz_KeyPoint/) is a blog website, where you can share your points with others by posting articles. This website supports account creation and management, commenting on articles and on other comments, liking articles and following authors, attaching tags to articles and browsing articles by tags, and more. This project is currently deployed on https://trex-sandwich.com/taz_KeyPoint/ . It is the final project for the PGCIT program of University of Auckland. My co-authors are Kalvin Wei and Esther Zhang.

## Tech Stack
  - **Database**: MariaDB
  - **Backend**: java - Servlets, DAO, JSP
  - **Frontend**: Bootstrap, jQuery, AJAX (HTML, CSS, JavaScript)

## Features
  - Browse and read articles

    ![](./screenshots/browseArticles.gif)

  - Read or hide comments

    ![](./screenshots/toggleCommentDisplay.gif)

  - View all articles by an author

    ![](./screenshots/viewAuthors.gif)

  - Personal blog page

    ![](./screenshots/personalBlogPage.gif)

  - Account creation

    ![](./screenshots/createAccount.gif)

    ![](./screenshots/userNameAndPassword.gif)

  - Edit personal profile

    ![](./screenshots/editProfile.gif)

  - Select or upload avatars

    ![](./screenshots/avatars.gif)

  - Create posts

    ![](./screenshots/createArticles.gif)

  - Attach cover images to your posts

    ![](./screenshots/covers.gif)

  - 'What you see is what you get' editor

    ![](./screenshots/WYSIWYG.gif)

  - Make comments

    ![](./screenshots/comments.gif)

  - Delete comments

    ![](./screenshots/deleteComment.gif)

  - Delete articles

    ![](./screenshots/deleteArticle.gif)

  - Delete account

    ![](./screenshots/deleteAccount.gif)

  - Filter articles by tags

    ![](./screenshots/filterArticlesByTags.gif)

  - Like articles

    ![](./screenshots/likeArticles.gif)

  - Browse the articles that you have liked

    ![](./screenshots/likedArticles.gif)

  - Follow authors

    ![](./screenshots/followAuthors.gif)

  - Browse your followers and authors you have followed

    ![](./screenshots/follows.gif)

  - Responsiveness on mobile devices

    ![](./screenshots/responsiveness.gif)

  - Prevention against XSS
  
    ![](./screenshots/preventXSS.gif)

  
#### Notes on Deployment
- Run run `/scripts/initSchema.sql` first to initialize the database